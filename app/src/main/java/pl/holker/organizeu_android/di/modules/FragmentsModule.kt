package pl.holker.organizeu_android.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import pl.holker.organizeu_android.functionalities.location_notes.LocationNotesFragment
import pl.holker.organizeu_android.functionalities.typical_notes.TypicalNotesFragment

@Module
abstract class FragmentsModule {
    @ContributesAndroidInjector
    abstract fun contributeTypicalNoteFragment(): TypicalNotesFragment

    @ContributesAndroidInjector
    abstract fun contributeLocationNoteFragment(): LocationNotesFragment
}