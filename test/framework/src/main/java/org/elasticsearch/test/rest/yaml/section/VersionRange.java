/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */
package org.elasticsearch.test.rest.yaml.section;

import org.elasticsearch.Version;

public class VersionRange {
    private final Version lower;
    private final Version upper;

    public VersionRange(Version lower, Version upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public Version getLower() {
        return lower;
    }

    public Version getUpper() {
        return upper;
    }

    public boolean contains(Version currentVersion) {
        return lower != null && upper != null && currentVersion.onOrAfter(lower) && currentVersion.onOrBefore(upper);
    }

    @Override
    public String toString() {
        return "[" + lower + " - " + upper + "]";
    }
}
