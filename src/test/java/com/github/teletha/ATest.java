/*
 * Copyright (C) 2019 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package com.github.teletha;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

public class ATest {

    @Test
    void testName() {
        Map<String, String> getenv = System.getenv();
        for (Entry<String, String> entry : getenv.entrySet()) {
            System.out.println(entry);
        }
    }
}
