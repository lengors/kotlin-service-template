# Welcome to Kotlin Service Template &middot; [![GitHub license](https://img.shields.io/github/license/lengors/kotlin-service-template?color=blue)](https://github.com/lengors/kotlin-service-template/blob/main/LICENSE) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=lengors_kotlin-service-template&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=lengors_kotlin-service-template)

Welcome to **kotlin-service-template**, a flexible starting point for creating service applications written in Kotlin.
This template is designed to streamline the setup process for new Kotlin projects, incorporating essential plugins and
dependencies to get you up and running quickly.

## Features

- **Dependencies**: Preconfigured with JUnit.
- **Plugins**: Includes Dokka, Kotlinx-kover, Ktlint and Shadow.
- **Branching Strategy**: Four branches (`main`, `beta`, `alpha`, and `dev`) to manage different stages of development
  and release.
- **CI/CD Pipelines**: Automated checks for code style, build, testing, static code analysis, publishing, deployment and
  documentation updates.

## Getting Started

#### Clone the repository

```bash
git clone https://github.com/lengors/kotlin-service-template.git
cd kotlin-service
```

#### Build the project

Ensure you have Gradle and JDK installed. Run:

```bash
./gradlew clean build
```

#### Run tests

```bash
./gradlew clean test
```

## Usage

This template is designed to be as customizable as you need. You can modify dependencies, plugins, or other
configurations to suit your specific project needs.

### Configuration

- **Documentation**: Ensure you update all the repository references for the automated generation of documentation
  via [Dokka](https://kotlinlang.org/docs/dokka-introduction.html).
- **Publishing Releases**: The publishing action relies
  on [semantic-release](https://semantic-release.gitbook.io/semantic-release/)
  and [semantic-release-action](https://github.com/cycjimmy/semantic-release-action). The `.releaserc.yml` file defines
  the release pipeline and automates versioning based on semantic versioning.
- **Jar Builds**: The [Gradle's Shadow plugin](https://gradleup.com/shadow/) generates a fat jar. For it to work
  properly, please update the the main class setting.
- **Dockerfile**: A dockerfile in the root directory is used to automatically deploy a docker image to GitHub Packages.
  Update it as it best fits your use case.

## Documentation and Resources

For detailed guides and additional information, please refer to
our [GitHub Wiki](https://github.com/lengors/kotlin-service-template/wiki).

If you wish to check an example of the generated API documentation, visit
the [Dokka generated reference](https://lengors.github.io/kotlin-service-template) page.

## Contributing

Contributions are welcome! Please refer to our [Contribution Guidelines](./CONTRIBUTING.md) for more information on how
to get involved.

## License

This project is licensed under [The Unlicense](./LICENSE), which places it in the public domain.