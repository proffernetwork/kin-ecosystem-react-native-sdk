
# react-native-kin-ecosystem-sdk

## Getting started

`$ npm install react-native-kin-ecosystem-sdk --save`

### Mostly automatic installation

`$ react-native link react-native-kin-ecosystem-sdk`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-kin-ecosystem-sdk` and add `RNKinEcosystemSdk.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNKinEcosystemSdk.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.proffernetwork.RNKinEcosystemSdkPackage;` to the imports at the top of the file
  - Add `new RNKinEcosystemSdkPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-kin-ecosystem-sdk'
  	project(':react-native-kin-ecosystem-sdk').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-kin-ecosystem-sdk/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-kin-ecosystem-sdk')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNKinEcosystemSdk.sln` in `node_modules/react-native-kin-ecosystem-sdk/windows/RNKinEcosystemSdk.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Kin.Ecosystem.Sdk.RNKinEcosystemSdk;` to the usings at the top of the file
  - Add `new RNKinEcosystemSdkPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNKinEcosystemSdk from 'react-native-kin-ecosystem-sdk';

// TODO: What to do with the module?
RNKinEcosystemSdk;
```
  