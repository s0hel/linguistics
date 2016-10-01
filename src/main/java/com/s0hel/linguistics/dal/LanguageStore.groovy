package com.s0hel.linguistics.dal

import com.s0hel.linguistics.model.LanguageEntry

abstract class LanguageStore {

    abstract Map<String, Map<String, LanguageEntry>> getCategoryEntryStore()
    abstract Map<String, LanguageEntry> getEntryStore()

}
