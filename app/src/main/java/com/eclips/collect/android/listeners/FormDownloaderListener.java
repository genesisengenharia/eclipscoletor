/*
 * Copyright (C) 2009 University of Washington
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.eclips.collect.android.listeners;

import java.util.HashMap;

import com.eclips.collect.android.logic.FormDetails;


/**
 * @author Carl Hartung (carlhartung@gmail.com)
 */
public interface FormDownloaderListener {
    void formsDownloadingComplete(HashMap<FormDetails, String> result);
    void progressUpdate(String currentFile, int progress, int total);
}