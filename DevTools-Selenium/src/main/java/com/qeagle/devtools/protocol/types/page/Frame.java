package com.qeagle.devtools.protocol.types.page;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2019 TL
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.qeagle.devtools.protocol.support.annotations.Experimental;
import com.qeagle.devtools.protocol.support.annotations.Optional;

/** Information about the Frame on the page. */
public class Frame {

  private String id;

  @Optional private String parentId;

  private String loaderId;

  @Optional private String name;

  private String url;

  @Experimental @Optional private String urlFragment;

  private String securityOrigin;

  private String mimeType;

  @Experimental @Optional private String unreachableUrl;

  /** Frame unique identifier. */
  public String getId() {
    return id;
  }

  /** Frame unique identifier. */
  public void setId(String id) {
    this.id = id;
  }

  /** Parent frame identifier. */
  public String getParentId() {
    return parentId;
  }

  /** Parent frame identifier. */
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /** Identifier of the loader associated with this frame. */
  public String getLoaderId() {
    return loaderId;
  }

  /** Identifier of the loader associated with this frame. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /** Frame's name as specified in the tag. */
  public String getName() {
    return name;
  }

  /** Frame's name as specified in the tag. */
  public void setName(String name) {
    this.name = name;
  }

  /** Frame document's URL without fragment. */
  public String getUrl() {
    return url;
  }

  /** Frame document's URL without fragment. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Frame document's URL fragment including the '#'. */
  public String getUrlFragment() {
    return urlFragment;
  }

  /** Frame document's URL fragment including the '#'. */
  public void setUrlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
  }

  /** Frame document's security origin. */
  public String getSecurityOrigin() {
    return securityOrigin;
  }

  /** Frame document's security origin. */
  public void setSecurityOrigin(String securityOrigin) {
    this.securityOrigin = securityOrigin;
  }

  /** Frame document's mimeType as determined by the browser. */
  public String getMimeType() {
    return mimeType;
  }

  /** Frame document's mimeType as determined by the browser. */
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  /**
   * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike
   * url above, this URL may contain a fragment.
   */
  public String getUnreachableUrl() {
    return unreachableUrl;
  }

  /**
   * If the frame failed to load, this contains the URL that could not be loaded. Note that unlike
   * url above, this URL may contain a fragment.
   */
  public void setUnreachableUrl(String unreachableUrl) {
    this.unreachableUrl = unreachableUrl;
  }
}
