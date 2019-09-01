package com.github.rmohammed4

import org.gradle.api.Project
import org.gradle.api.Plugin

class SctPlugin implements Plugin<Project> {
    void apply(Project target) {
        target.tasks.register('changelog', ChangeLogTask)
        target.tasks.changelog.group = "changelog"
        target.tasks.changelog.description = "Builds a changelog using the simple changelog tool"
    }
}
