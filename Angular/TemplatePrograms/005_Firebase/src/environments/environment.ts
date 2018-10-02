// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
  firebase : {
        apiKey: "AIzaSyBL9uwos-RipUfo21NnMrNSM_5sl-qWv0w",
        authDomain: "my-sample-project-ec77d.firebaseapp.com",
        databaseURL: "https://my-sample-project-ec77d.firebaseio.com",
        projectId: "my-sample-project-ec77d",
        storageBucket: "my-sample-project-ec77d.appspot.com",
        messagingSenderId: "383025428301"
  }
};

/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.
