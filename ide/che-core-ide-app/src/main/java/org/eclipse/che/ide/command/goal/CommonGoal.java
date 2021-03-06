/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.command.goal;

import com.google.inject.Inject;
import org.eclipse.che.ide.api.command.BaseCommandGoal;

/**
 * Represents predefined 'Common' goal. By default it's used for grouping commands which doesn't
 * belong to any goal.
 *
 * @author Artem Zatsarynnyi
 */
public class CommonGoal extends BaseCommandGoal {

  @Inject
  public CommonGoal() {
    super("Common");
  }
}
