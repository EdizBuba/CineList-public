package com.but.cinelist

import android.app.Application
import timber.log.Timber

class CineApp: Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())

    }
}
