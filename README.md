# Manipulating-images
the four java files are my files to manipulate images.<br/>
The IDE app(intellij or other types of IDE apps) is needed to run the program.<br/>
Procedures to run the code: <br/>
1. args[0]:  name of the input file.<br/>
2. args[1]:  name of the output file.<br/>
3. args[2]:  the format of the output file. It should be either pgm or pnm.<br/>
4. args[3]:  the operation to perform. It can be any of 4 values: -fh for horizontal flip, -fv for vertical flip, -gs for greyscale conversion, or -cr for crop.<br/>
5. args[4], args[5], args[6], args[7] These arguments are present only when the option -cr is specified.<br/>
<br/>
run Photoshop cat.pnm cat-changed.pgm pgm -gs<br/>
or <br/>
run Comp202Photoshop cat.pnm cat-cropped.pnm pnm -cr 10 15 30 40<br/>
