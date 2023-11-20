# upload-web-testing

Simple upload feature testing example in web platform using Serenity BDD.

## Notes

- The specific example for testing the upload feature can be checked in `uploadFile()` method in `UploadPage` class.
- Inside the `src/test/resources/webdriver`, make sure to replace the chrome driver based on the operating system and Chrome version. Download the available Chrome driver in [here](https://chromedriver.chromium.org/downloads).
- For Windows user, make sure change the `webdriver.chrome.driver` value with `.exe` in the end. For example:

```properties
webdriver.chrome.driver=src/test/resources/webdriver/chromedriver.exe
```

## How to Use

1. Clone this repository.
2. Inside the `src/test/resources/webdriver` directory. Make sure the chrome driver is using the correct version.
3. Run the test.

```shell
mvn clean verify
```