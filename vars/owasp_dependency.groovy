def call() {
    dependencyCheck(
        odcInstallation: 'Dependency-Check'
    )
    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
