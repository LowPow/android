package com.tamdevs.downloader.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase

class AppDbHelper(context: Context?) : DbHelper {

    private val db: SQLiteDatabase

    override fun find(id: Int): DownloadModel? {
        var cursor: Cursor? = null
        var model: DownloadModel? = null
        try {
            cursor = db.rawQuery(
                "SELECT * FROM " + TABLE_NAME + " WHERE " +
                        DownloadModel.ID + " = " + id, null
            )
            if (cursor != null && cursor.moveToFirst()) {
                model = DownloadModel()
                model.id = id
                model.url = cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.URL))
                model.eTag = cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.ETAG))
                model.dirPath =
                    cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.DIR_PATH))
                model.fileName =
                    cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.FILE_NAME))
                model.totalBytes =
                    cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.TOTAL_BYTES))
                model.downloadedBytes =
                    cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.DOWNLOADED_BYTES))
                model.lastModifiedAt =
                    cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.LAST_MODIFIED_AT))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            cursor?.close()
        }
        return model
    }

    override fun insert(model: DownloadModel) {
        try {
            val values = ContentValues()
            values.put(DownloadModel.ID, model.id)
            values.put(DownloadModel.URL, model.url)
            values.put(DownloadModel.ETAG, model.eTag)
            values.put(DownloadModel.DIR_PATH, model.dirPath)
            values.put(DownloadModel.FILE_NAME, model.fileName)
            values.put(DownloadModel.TOTAL_BYTES, model.totalBytes)
            values.put(DownloadModel.DOWNLOADED_BYTES, model.downloadedBytes)
            values.put(DownloadModel.LAST_MODIFIED_AT, model.lastModifiedAt)
            db.insert(TABLE_NAME, null, values)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun update(model: DownloadModel) {
        try {
            val values = ContentValues()
            values.put(DownloadModel.URL, model.url)
            values.put(DownloadModel.ETAG, model.eTag)
            values.put(DownloadModel.DIR_PATH, model.dirPath)
            values.put(DownloadModel.FILE_NAME, model.fileName)
            values.put(DownloadModel.TOTAL_BYTES, model.totalBytes)
            values.put(DownloadModel.DOWNLOADED_BYTES, model.downloadedBytes)
            values.put(DownloadModel.LAST_MODIFIED_AT, model.lastModifiedAt)
            db.update(
                TABLE_NAME,
                values,
                DownloadModel.ID + " = ? ",
                arrayOf(model.id.toString())
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun updateProgress(id: Int, downloadedBytes: Long, lastModifiedAt: Long) {
        try {
            val values = ContentValues()
            values.put(DownloadModel.DOWNLOADED_BYTES, downloadedBytes)
            values.put(DownloadModel.LAST_MODIFIED_AT, lastModifiedAt)
            db.update(
                TABLE_NAME,
                values,
                DownloadModel.ID + " = ? ",
                arrayOf(id.toString())
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun remove(id: Int) {
        try {
            db.execSQL(
                "DELETE FROM " + TABLE_NAME + " WHERE " +
                        DownloadModel.ID + " = " + id
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun getUnwantedModels(days: Int): List<DownloadModel> {
        val models: MutableList<DownloadModel> = ArrayList()
        var cursor: Cursor? = null
        try {
            val daysInMillis = days * 24 * 60 * 60 * 1000L
            val beforeTimeInMillis = System.currentTimeMillis() - daysInMillis
            cursor = db.rawQuery(
                "SELECT * FROM " + TABLE_NAME + " WHERE " +
                        DownloadModel.LAST_MODIFIED_AT + " <= " + beforeTimeInMillis, null
            )
            if (cursor != null && cursor.moveToFirst()) {
                do {
                    val model = DownloadModel()
                    model.id = cursor.getInt(cursor.getColumnIndexOrThrow(DownloadModel.ID))
                    model.url = cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.URL))
                    model.eTag =
                        cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.ETAG))
                    model.dirPath =
                        cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.DIR_PATH))
                    model.fileName =
                        cursor.getString(cursor.getColumnIndexOrThrow(DownloadModel.FILE_NAME))
                    model.totalBytes =
                        cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.TOTAL_BYTES))
                    model.downloadedBytes =
                        cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.DOWNLOADED_BYTES))
                    model.lastModifiedAt =
                        cursor.getLong(cursor.getColumnIndexOrThrow(DownloadModel.LAST_MODIFIED_AT))
                    models.add(model)
                } while (cursor.moveToNext())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            cursor?.close()
        }
        return models
    }

    override fun clear() {
        try {
            db.delete(TABLE_NAME, null, null)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    companion object {
        const val TABLE_NAME = "downloader"
    }

    init {
        val databaseOpenHelper = DatabaseOpenHelper(context)
        db = databaseOpenHelper.writableDatabase
    }
}