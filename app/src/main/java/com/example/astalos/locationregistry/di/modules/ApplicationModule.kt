package com.example.astalos.locationregistry.di.modules

import android.content.Context
import com.example.astalos.locationregistry.presentation.RegistryApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Tomasz Czura on 9/4/18.
 */
@Module
class ApplicationModule(private val application: RegistryApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application
}