All code examples should run with Java 5 or later except:
headfirst.headfirst.designpatterns.observer.swing.SwingObserverExample
headfirst.headfirst.designpatterns.command.simpleremoteWL.RemoteControlTest
headfirst.headfirst.designpatterns.command.remoteWL.RemoteLoader

These instructions assume you've compiled the code to a classes/ directory.
Your directory may be called bin/ instead (for instance, if you specified that directly,
or you're using Eclipse with default settings).

Chapter 1 - Strategy Pattern
--------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.strategy.MiniDuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.strategy.MiniDuckSimulator1

Chapter 2 - Observer Pattern
--------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.observer.weather.WeatherStation
java -cp ./classes headfirst.headfirst.designpatterns.observer.weather.WeatherStationHeatIndex
java -cp ./classes headfirst.headfirst.designpatterns.observer.weatherobservable.WeatherStation
java -cp ./classes headfirst.headfirst.designpatterns.observer.weatherobservable.WeatherStationHeatIndex
java -cp ./classes headfirst.headfirst.designpatterns.observer.swing.SwingObserverExample

To run the Swing example, use Java 8 or later.
Look in the source file to see the older (Java 5) code, and you can run the older
code by commenting out the new lambda code and uncommenting the old code.

Chapter 3 - Decorator Pattern
------------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.decorator.starbuzz.StarbuzzCoffee

For the InputTest example, make sure you have the file test.txt in 
the directory where you run headfirst.headfirst.designpatterns.decorator.io.InputTest
(usually your src/ directory).

java -cp ./classes headfirst.headfirst.designpatterns.decorator.io.InputTest

Chapter 4 - Factory Patterns
--------------------------------------------------------
Simple Factory
java -cp ./classes headfirst.headfirst.designpatterns.factory.pizzasimplefactory.PizzaTestDrive

Factory Method
java -cp ./classes headfirst.headfirst.designpatterns.factory.pizzafabricmethod.PizzaTestDrive

Abstract Factory
java -cp ./classes headfirst.headfirst.designpatterns.factory.pizzaabstractfactory.PizzaTestDrive

Chapter 5 - Singleton Pattern
----------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.singleton.chocolate.ChocolateController
java -cp ./classes headfirst.headfirst.designpatterns.singleton.stat.SingletonClient
java -cp ./classes headfirst.headfirst.designpatterns.singleton.dcl.SingletonClient
java -cp ./classes headfirst.headfirst.designpatterns.singleton.subclass.SingletonTestDrive

Chapter 6 - Command Pattern
------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.command.simpleremote.RemoteControlTest
java -cp ./classes headfirst.headfirst.designpatterns.command.remote.RemoteLoader
java -cp ./classes headfirst.headfirst.designpatterns.command.undo.RemoteLoader
java -cp ./classes headfirst.headfirst.designpatterns.command.party.RemoteLoader

To run the examples with lambda expressions, make sure you're using Java 8 or later.
java -cp ./classes headfirst.headfirst.designpatterns.command.simpleremoteWL.RemoteControlTest
java -cp ./classes headfirst.headfirst.designpatterns.command.remoteWL.RemoteLoader

Chapter 7 - Adapter and Facade Patterns
------------------------------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.adapter.ducks.DuckTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.adapter.ducks.TurkeyTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.adapter.iterenum.EI one two three
java -cp ./classes headfirst.headfirst.designpatterns.adapter.iterenum.IteratorEnumerationTestDrive one two three four five six
java -cp ./classes headfirst.headfirst.designpatterns.adapter.iterenum.EnumerationIteratorTestDrive seven eight nine ten eleven twelve
java -cp ./classes headfirst.headfirst.designpatterns.facade.hometheater.HomeTheaterTestDrive

Chapter 8 - Template Method Pattern
----------------------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.templatemethod.simplebarista.Barista
java -cp ./classes headfirst.headfirst.designpatterns.templatemethod.barista.BeverageTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.templatemethod.sort.DuckSortTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.templatemethod.frame.MyFrame

Chapter 9 - Iterator and Composite Patterns
--------------------------------------------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.iterator.dinermerger.MenuTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.iterator.dinermergeri.MenuTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.iterator.dinermergercafe.MenuTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.composite.menu.MenuTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.composite.menuiterator.MenuTestDrive

Chapter 10 - State Pattern
----------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.state.gumball.GumballMachineTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.state.gumballstate.GumballMachineTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.state.gumballstatewinner.GumballMachineTestDrive

Chapter 11 - Proxy Pattern
----------------------------------------------------
java -cp ./classes headfirst.headfirst.designpatterns.proxy.javaproxy.MatchMakingTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.proxy.virtualproxy.ImageProxyTestDrive

to run the gumball proxy example:
 - run headfirst.headfirst.designpatterns.proxy.gumball.GumballMachineTestDrive <host> <# of gumballs>
   on each machine
 - then run headfirst.headfirst.designpatterns.proxy.gumball.GumballMonitorTestDrive to monitor them
 - you'll need to edit GumballMonitorTestDrive to point to the correct machines
 - if you're running it all on the same machine, you can use localhost as the host

Chapter 12 - Combining Patterns
--------------------------------------------------------------
Why a Duck?
java -cp ./classes headfirst.headfirst.designpatterns.combining.ducks.DuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.combining.adapter.DuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.combining.decorator.DuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.combining.factory.DuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.combining.composite.DuckSimulator
java -cp ./classes headfirst.headfirst.designpatterns.combining.observer.DuckSimulator

MVC
java -cp ./classes headfirst.headfirst.designpatterns.combined.djview.DJTestDrive
java -cp ./classes headfirst.headfirst.designpatterns.combined.djview.HeartTestDrive