/*
 * VoIP.ms SMS
 * Copyright (C) 2018 Michael Kourlas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.kourlas.voipms_sms.utils

import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceScreen

/**
 * Extension property allowing easy iteration over a [PreferenceScreen]'s
 * preferences.
 */
val PreferenceScreen.preferences: Iterable<Preference>
    get() = object : Iterable<Preference> {
        override fun iterator(): Iterator<Preference> {
            return object : Iterator<Preference> {
                var i = 0
                override fun hasNext(): Boolean = i < preferenceCount
                override fun next(): Preference = getPreference(i++)
            }
        }
    }