package com.github.rmohammed4

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class ChangeLogTaskTest {
    @Test
    void canAddTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('changelog', type: ChangeLogTask)
        assertTrue(task instanceof ChangeLogTask)
    }
}
