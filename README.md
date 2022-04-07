# Проект для домашки/диплома(mobile-часть)
<a target="_blank" href="https://play.google.com/store/apps/details?id=ru.yandex.translate">Яндекс переводчик</a>

## :pushpin: Содержание:

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#Реализованные-проверки)
- [Jenkins job](#-Jenkins-job)
- [Окружения](#-computer-Запуск-тестов-из-терминала)
- [Allure отчет](#-Allure-отчет)
- [BrowserStack](#-BrowserStack)

## :rocket: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://appium.io/index.html"><img src="images/Appium.svg" width="50" height="50"  alt="Appium"/></a>
<a href="https://www.browserstack.com/"><img src="images/Browserstack.svg" width="50" height="50"  alt="Browserstack"/></a>
<a href="https://developer.android.com/studio"><img src="images/Android_Studio.png" width="50" height="50"  alt="Android Studio"/></a>
</p>

## Реализованные проверки

- ✓ Проверка перевода.
- ✓ Проверка смены языка.
- ✓ Проверка настроек.


## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a> Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/qaDiplomaMobile/">Сборка в Jenkins</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/qaDiplomaMobile/"><img src="images/Jenkins_job.png" alt="Jenkins"/></a>
</p>

## Параметры сборки в Jenkins: 

- ENV (окружение)


## :computer: Запуск тестов из терминала

Локальный и удаленный запуск:
```bash
локально и удаленно
gradle clean test -DdeviceHost=browserstack 
```
```bash
только локальный запуск через эмулятор
gradle clean test -DdeviceHost=emulation 
```
```bash
только локальный запуск на реальном устройстве
gradle clean test -DdeviceHost=realDevice 
```

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a> Allure отчет

<a target="_blank" href="https://jenkins.autotests.cloud/job/qaDiplomaMobile/5/allure/">Аллюр</a>

<p align="center">
<img title="Allure Results" src="images/Allure_results.png">
</p>


## <img src="images/browserstack.svg" width="25" height="25"  alt="BrowserStack"/></a> BrowserStack

<p align="center">
<img title="BrowserStack results" src="images/BrowserStack_results.png">
</p>

<p align="center">
<img title="BrowserStack Video" src="images/BrowserStack_video.gif" width="250" height="250"  alt="video"> 
</p>
