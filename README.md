# MaskedTextView
This MaskedTextView is a custom TextView designed to mask the middle portion of a given text with *. It is particularly useful for displaying sensitive information such as passwords, PIN codes, or personal data securely.

> Add it in your root build.gradle at the end of repositories:
```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
> Add the dependency
```
dependencies {
	        implementation 'com.github.freelancermustakin:MaskedTextView:Tag'
	}
```
