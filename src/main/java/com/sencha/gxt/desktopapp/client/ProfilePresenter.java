/**
 * Sencha GXT 1.0.0-SNAPSHOT - Sencha for GWT
 * Copyright (c) 2006-2018, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Commercial License
 * ================================================================================
 * This version of Sencha GXT is licensed commercially and is the appropriate
 * option for the vast majority of use cases.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.sencha.gxt.desktopapp.client;

import com.google.gwt.user.client.ui.HasWidgets;

/**
 * Presents the profile settings view to the user.
 */
public interface ProfilePresenter {

  /**
   * Gets a copy of the current profile. This copy may be updated with changes
   * to the profile settings.
   * 
   * @return a copy of the current profile
   */
  ProfileModel getProfile();

  /**
   * Creates a profile view and connects it to the user interface.
   * 
   * @param hasWidgets the user interface
   */
  void go(HasWidgets hasWidgets);

  /**
   * Notifies the presenter that the user has cancelled the profile update
   * operation.
   */
  void onCancel();

  /**
   * Notifies the presenter that the user has completed the profile update
   * operation.
   */
  void onOkay();

}
