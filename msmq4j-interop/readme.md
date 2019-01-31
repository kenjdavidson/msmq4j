# Msmq4j J-Interop

MSMQ client library using J-Interop.

## Getting Started

Setup and test using J-Interop library with com4j MSMQ Com Interfaces or directly with J-Interop.

### Prerequisites

A little bit of research into the following:

* [J-Interop](http://www.j-interop.org/quickstart.html) - J-Interop library

There is an issue with the release 3.0.0 and a known bug has been fixed but not released.  In order to get around this, you can build the new version yourself or you can use a pre-created project on github.

### Installing

Basic installation:

* Clone msmq4j projects
* Get a local copy of jinterop/jinteropdeps which have the ArrayIndexOutOfBoundsException resolve.  There is no release, so this needs to be maintained yourself.  See installation for details.

I've used the projects:

* [jinterop](http://www.github.com/howie/jinterop) - jinterop hosted on github
* [jinteropdeps](http://www.github.com/howie/jinteropdeps) - jinteropdesp hosted on github

After cloning these projects, run 

```
mvn clean install
```

to build and get them available in your local repository.

#### Windows 10 Setup:

When installing on Windows 10 a local account should be used for testing.  Without the following you will recieve a Access Denied 0x00000005 error.

* Create a new user, dcomadmin/dcomadmin
* Add dcomadmin user to Com Security using Windows Key > Component Services > Computers > My Computer > Properties > Com Security
* Ensure local/remote access

Once complete, you may receive ArrayIndexOutOfBoundsException

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [J-Interop](http://www.j-interop.org/) - J-Interop library
* [jinterop](http://www.github.com/howie/jinterop) - Github version of J-Interop

## Acknowledgments

* [Vikram Roopchand](http://www.j-interop.org/)
