package com.github.rmohammed4

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class SctPluginTest {
    @Test
    void gradleSctPluginAddsChangeLogTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.github.rmohammed4.gradleSct'

        assertTrue(project.tasks.changelog instanceof ChangeLogTask)
    }
}
