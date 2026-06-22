### Hexlet tests and linter status:

[![Actions Status](https://github.com/LittleC0rgi/java-project-78/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/LittleC0rgi/java-project-78/actions)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=littlec0rgi_third-app&metric=alert_status&token=c65b7c59bdab9e801c3591d87ae3b03d695e6f0d)](https://sonarcloud.io/summary/new_code?id=littlec0rgi_third-app)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=littlec0rgi_third-app&metric=coverage&token=c65b7c59bdab9e801c3591d87ae3b03d695e6f0d)](https://sonarcloud.io/summary/new_code?id=littlec0rgi_third-app)

# Data Validator

Учебный проект на Java — реализация библиотеки для валидации данных по заданным схемам.
Поддерживает три типа схем: строки, числа и словари (Map), каждый из которых настраивается через цепочку методов в стиле Builder.

## Быстрый старт

Клонируйте репозиторий и выполните команды:

```bash
# Собрать проект
make build

# Запустить проект
make run-dist

# Запустить тесты
make test

# Собрать и сразу запустить
make build-and-run
```

> Требуется OpenJDK версии 21 и Gradle версии не ниже 8.7
