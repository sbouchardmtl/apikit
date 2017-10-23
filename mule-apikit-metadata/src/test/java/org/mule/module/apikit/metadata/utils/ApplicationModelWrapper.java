/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.apikit.metadata.utils;

import org.mule.runtime.config.api.dsl.model.ComponentModel;

import java.util.Optional;

public interface ApplicationModelWrapper {

  ComponentModel findRootComponentModel();

  Optional<ComponentModel> findNamedComponent(String var1);

  Optional<String> findTypesData();
}