/* Copyright 2015 Samsung Electronics Co., LTD
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

package org.gearvrf.scene_objects.view;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import org.gearvrf.GVRApplication;
import org.gearvrf.scene_objects.GVRViewSceneObject;

/**
 * This class represents a {@link WebView} that is rendered
 * into the attached {@link GVRViewSceneObject}
 * See {@link GVRView} and {@link GVRViewSceneObject}
 */
@Deprecated
public class GVRWebView extends WebView implements GVRView {
    private GVRViewSceneObject mSceneObject = null;

    @Deprecated
    public GVRWebView(GVRApplication application) {
        super(application.getActivity());

        setWebViewClient(new WebViewClient());
        application.registerView(this);
    }

    @Override
    public void setSceneObject(GVRViewSceneObject sceneObject) {
        mSceneObject = sceneObject;
    }

    @Override
    public View getView() {
        return this;
    }
}
