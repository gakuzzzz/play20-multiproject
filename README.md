Play2.0 Multi Project Example
===========================================================

Project Structure
---------------------------------------

    play20-multiproject/             The root project aggregates submodule and subplay
        +- submodule/                A simple scala project
        |      +- build.sbt          Defines submodule project settings
        |      +- ...
        +- subplay/                  A normal play2.0 project depends on submodule
        |      +- build.sbt          Defines subplay project settings
        |      +- ...
        +- project/
               +- Build.scala        Defines the multiple project structure
               +- plugins.sbt        Defines plugin settings


How to run Play application
---------------------------------------

    $ sbt
    > project subplay
    [subplay] $ run


