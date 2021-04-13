/*
 * Copyright (C) 2021 xelan Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
public class Project extends bee.api.Project {

    {
        product("com.github.teletha", "xelan", ref("version.txt"));

        require("com.github.teletha", "antibug");
    }
}