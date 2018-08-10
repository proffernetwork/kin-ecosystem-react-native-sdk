const createLibrary = require('react-native-create-library');

createLibrary({
  name: 'KinEcosystemSDK',
  authorName: 'Sinchan',
  packageIdentifier: 'com.proffernetwork',
  generateExample: true
}).then(() => {
  console.log('Oh yay! My library has been created!');
})