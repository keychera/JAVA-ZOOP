# from https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html

JCC = javac
JFLAGS = -g
.SUFFIXES: .java .class
.java.class:
	$(JCC) $(JFLAGS) $*.java

CLASSES = \
	# animal_list
	animal_list/ArcticFox.java \
	animal_list/Beluga.java \
	animal_list/Clownfish.java \
	animal_list/Komodo.java \
	animal_list/RedKite.java \
	animal_list/Axolotl.java \
	animal_list/Biawak.java \
	animal_list/Coyote.java \
	animal_list/Leopard.java \
	animal_list/Tiger.java \
	animal_list/BadakJawa.java \
	animal_list/BlackKite.java \
	animal_list/Damselfish.java \
	animal_list/Narwhal.java \
	animal_list/Wolf.java \
	animal_list/BadakSumatra.java \
	animal_list/Cat.java \
	animal_list/Dolphin.java \
	animal_list/Orca.java \
	animal_list/BaldEagle.java \
	animal_list/Cheetah.java \
	animal_list/GoldenEagle.java \
	animal_list/RedFox.java \

	# animal
	animal/Animal.java \
	animal/HabitatStatus.java \
	animal/IHabitatStatus.java \
	animal/Classification.java \
	animal/IClassification.java \
	animal/ITameStatus.java \
	animal/DietStatus.java \
	animal/IDietStatus.java \

	# cell
	cell/AirHabitat.java \
	cell/Exit.java \
	cell/LandHabitat.java \
	cell/Road.java \
	cell/Cell.java \
	cell/Facility.java \
	cell/Park.java \
	cell/WaterHabitat.java \
	cell/Entrance.java \
	cell/Habitat.java \
	cell/Restaurant.java \

	# pathfinder
	pathfinder/Path.java \
	pathfinder/PathFinder.java \
	pathfinder/PathLabel.java \

	# renderable
	renderable/Renderable.java \

	# unit_test
	unit_test/AirHabitatTest.java \
	unit_test/HabitatTest.java \
	unit_test/RoadTest.java \
	unit_test/Animal_test.java \
	unit_test/LandHabitatTest.java \
	unit_test/TestRunner.java \
	unit_test/CageTest.java \
	unit_test/map.txt Tour_test.java \
	unit_test/CellTest.java \
	unit_test/map_animal.txt WaterHabitatTest.java \
	unit_test/EntranceTest.java \
	unit_test/ParkTest.java \
	unit_test/ZooTest.java \
	unit_test/ExitTest.java \
	unit_test/Queue_test.java \
	unit_test/FacilityTest.java \
	unit_test/RestaurantTest.java \

	# location
	location/ILocation.java \
	location/Location.java \

	# queue
	queue/Queue.java \
	queue/QueueItem.java \

	# tour
	tour/Tour.java \

	# zoo
	zoo/Cage.java \
	zoo/Main.java \
	zoo/Zoo.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class