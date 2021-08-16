package com.mo22sen.hellocompose.utils

import android.util.Log
import com.mo22sen.hellocompose.R
import com.mo22sen.hellocompose.network.ResultCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun <T : Any> safeApiCall(
    call: suspend () -> ResultCall<T>
): ResultCall<T> {
    return withContext(Dispatchers.Main) {
        try {
            withContext(Dispatchers.IO) {
                call()
            }
        } catch (e: Exception) {
            Log.e("Error Tag", "safeApiCall: $e ")
            ResultCall.Error(R.string.app_name, 0)
        }
    }
}