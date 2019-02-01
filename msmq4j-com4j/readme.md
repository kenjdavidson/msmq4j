# Msmq4j Com4j Interfaces

Contains the g-enerated Com4j interaces from Windows 10 available MQOA[.tlb|.dll] files.

## Getting Started

By including this project (jar) through either download or Jitpack plugin you gain access to the all the available MSMQ COM interfaces at the time of building.  To create these files for yourself/machine follow the instructions below.  This project contains generated Interfaces for:

* kjd.microsoft.msmq.mqoa10 Contains generated sources for mqoa10.tlb (v1.0)
* kjd.microsoft.msmq.mqoa20 Contains generated sources for mqoa20.tlb (v2.0)
* kjd.microsoft.msmq.mqoa30 Contains generated sources for mqoa30.tlb (v3.0)
* kjd.microsoft.msmq.mqoa40 Contains generated sources for mqoa.dll (v4.0)
* kjd.microsoft.msmq.mqoa Contains the current working copy of the library.  This package is where the functionality will run from in order to allow for future upgrades and some patches, without losing the original library.

### Prerequisites

* [Microsoft Messaging Queue](https://msdn.microsoft.com/en-us/library/windows/desktop/ms711472.aspx) - Provides information on general functionality.
* [MSMQ COM Interface Library](https://msdn.microsoft.com/en-us/library/windows/desktop/ms704064.aspx) - Provides specific COM references.
* [Com4j](http://com4j.kohsuke.org/) - Build COM Interfaces for Java bridge.

You also need to ensure that your user is setup with Admin access to the COM Server.  J-Interop allows for dynamic login, which I haven't figured out how to do with Com4j yet.  Until then, make sure you add yourself:

* Start > Component Services
* Component services > Computers > My Computer
* Right click > COM Security
* Add appropriate users with the access required for testing.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [COM4J](http://com4j.kohsuke.org/) - Generate COM Interfaces
* [com4j-maven-plugin](http://com4j.kohsuke.org/maven-com4j-plugin/index.html) - Generate COM Interfaces with com4j:gen

## Contributing

N/A

## Versioning

Currently development will be put into package **kjd.microsoft.msmq.mqoa** as this is version 4.0 (latest available with Windows 10). 

## Acknowledgments

* [Kohsuke Kawaguchi](http://com4j.kohsuke.org/)
