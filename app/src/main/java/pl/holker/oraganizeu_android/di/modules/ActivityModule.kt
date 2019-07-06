package pl.holker.oraganizeu_android.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.holker.oraganizeu_android.MainActivity
import pl.holker.oraganizeu_android.di.ActivityScope

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeLoginActivity(): MainActivity
}