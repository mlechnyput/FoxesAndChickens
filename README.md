# FoxesAndChickens from Codewars

Old MacDingle had a farm, he had a free-range chicken farm. But Old MacDingle also had a fox problem.
Foxes F eat chickens C. At night the only guaranteed "safe" chickens are in their cages [] (unless a fox has got into the cage with them!)

TASK

Given the initial configuration of foxes and chickens what will the farm look like the next morning after the hungry foxes have been feasting?

EXAMPLE 1

Before	
CCC[CCC]FCC[CCCCC]CFFFF[CCC]FFFF
After	
...[CCC]F..[CCCCC].FFFF[CCC]FFFF

EXAMPLE 2

Before	
...[CCC]...[CCCFC].....[CCC]....
After	
...[CCC]...[...F.].....[CCC]....

EXAMPLE 3

Before	
CCC[CCC]FCC[CCCFC]CFFFF[CCC]FFFF
After	
...[CCC]F..[...F.].FFFF[CCC]FFFF

Notes
Anything not a fox, a chicken, or a cage is just dirt .
All cages are intact (not open-ended), and there are no cages inside other cages
