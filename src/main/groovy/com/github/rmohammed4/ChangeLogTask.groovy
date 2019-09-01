package com.github.rmohammed4

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

import com.github.bzumhagen.sct.BuildChangelog

class ChangeLogTask extends DefaultTask {
    String config = "changelog.conf"
    String repo = "./"

    @Option(option = "repo", description = "Absolute path to git repository, defaults to ./")
    void setRepo(String repo) {
        this.repo = repo
    }

    @Input
    String getRepo() {
        return repo
    }

    @Option(option = "config", description = "Absolute path to changelog.conf, defaults to ./changelog.conf")
    void setConfig(String config) {
        this.config = config
    }

    @Input
    String getConfig() {
        return config
    }

    @TaskAction
    def buildChangeLog() {
        BuildChangelog.main(["-r", repo, "-c", config] as String[])
    }
}
