/*
 * Copyright 2014 Julian Shen
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

package jlnshen.kptaipei.model;

import java.util.HashMap;

public class Photo {
    public String id;
    public long date_upload;
    public long date_taken;
    public String title;
    public int isprimary;
    public String link;
    public HashMap<String, String> images = new HashMap<String, String>();
    public HashMap<String, Float> location = new HashMap<String, Float>();
}
