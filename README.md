## Popular Movies App - Espresso QA Automation

Forked from https://github.com/gr3y6h0st/Popular-Movies-App, app created by Jayvy Difuntorum,
Espresso tests written by Dustin Sison.

### An Inside Look:

Popular Movies is a fully-featured application that requests movie information from The Movie
Database API over a web service.

<img src="https://dev.azure.com/dsison/23d87719-e994-4ab4-bb14-3780c61af63f/_apis/git/repositories/373caed4-eaf4-4391-9cb3-c0a45e397e49/items?path=/README_Resources/README_Movies_Landing.png&versionDescriptor%5BversionOptions%5D=0&versionDescriptor%5BversionType%5D=0&versionDescriptor%5Bversion%5D=master&resolveLfs=true&%24format=octetStream&api-version=5.0" width="250"> <img src="https://dev.azure.com/dsison/23d87719-e994-4ab4-bb14-3780c61af63f/_apis/git/repositories/373caed4-eaf4-4391-9cb3-c0a45e397e49/items?path=/README_Resources/README_Movies_Landing_2.png&versionDescriptor%5BversionOptions%5D=0&versionDescriptor%5BversionType%5D=0&versionDescriptor%5Bversion%5D=master&resolveLfs=true&%24format=octetStream&api-version=5.0" width="250"> <img src="https://dev.azure.com/dsison/23d87719-e994-4ab4-bb14-3780c61af63f/_apis/git/repositories/373caed4-eaf4-4391-9cb3-c0a45e397e49/items?path=/README_Resources/README_Movies_Settings.png&versionDescriptor%5BversionOptions%5D=0&versionDescriptor%5BversionType%5D=0&versionDescriptor%5Bversion%5D=master&resolveLfs=true&%24format=octetStream&api-version=5.0" width="250"> <img src="https://dev.azure.com/dsison/23d87719-e994-4ab4-bb14-3780c61af63f/_apis/git/repositories/373caed4-eaf4-4391-9cb3-c0a45e397e49/items?path=/README_Resources/README_Movies_Movie_Detail.png&versionDescriptor%5BversionOptions%5D=0&versionDescriptor%5BversionType%5D=0&versionDescriptor%5Bversion%5D=master&resolveLfs=true&%24format=octetStream&api-version=5.0" width="250"> <img src="https://dev.azure.com/dsison/23d87719-e994-4ab4-bb14-3780c61af63f/_apis/git/repositories/373caed4-eaf4-4391-9cb3-c0a45e397e49/items?path=/README_Resources/Pop_Movies_Home_Activity.png&versionDescriptor%5BversionOptions%5D=0&versionDescriptor%5BversionType%5D=0&versionDescriptor%5Bversion%5D=master&resolveLfs=true&%24format=octetStream&api-version=5.0" width="250">

The app is able to pull the most recent data on all movies released to-date and sort them according
to popularity, rating, or by user favorite titles.

### Setup:

To build this app locally, you will need an API Key from The Movie Database, which you can obtain
here:

https://www.themoviedb.org/settings/api

If needed, create an account, then generate an API key. Once you have this key, clone the repository
locally, and open the /app/build.gradle file.

Under BuildTypes > Debug > BuildConfigField, replace API_KEY with the generated API key from The
Movie Database. It should look something like this afterwards:

> buildConfigField 'String', "ApiKey", "\"f1faee8ee152f2eb88a5e28e2e1d1128\""

The app should now be able to compile.