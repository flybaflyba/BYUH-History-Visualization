
rawInfo = []

filename = "C:/Users/litia/OneDrive - Brigham Young University Hawaii/Desktop/byuh events python helper/raw info.txt"

with open(filename, encoding='utf-8', mode = 'r') as f:
    for line in f:
        if repr(line)[1:-3] != "":
            rawInfo.append(repr(line)[1:-3])

print("length of rawInfo array: " + str(len(rawInfo)))

dates = [] 
infos = []

dateIndex = 0
infoIndex = 1
for index in range(0,len(rawInfo)):
    if index == dateIndex:
        dates.append(rawInfo[index])
        dateIndex = dateIndex + 2
    if index == infoIndex:
        infos.append(rawInfo[index])
        infoIndex = infoIndex + 2
    
    
print("length of dates array: " + str(len(dates)))
# for d in dates:
#     print(d)


print("length of infos array: " + str(len(infos)))
# for i in infos:
#     print(i)

years = []
for d in dates:
    years.append(d[-4:])

print("length of years array: " + str(len(years)))
# for y in years:
#     print(y)


numbersOrSymboles = ["0","1","2","3","4","5","6","7","8","9",",","-"," "]
letters = ["zero","one","two","three","four","five","six","seven","eight","nine","comma","dash","space"]

duplicatesCount = 0
newFileNames = []
for d in dates:
    newFileNameTemp = d.lower()
    newFileName = ""

    for x in newFileNameTemp: 
        if x in numbersOrSymboles:
            newFileName = newFileName + "_" + letters[numbersOrSymboles.index(x)]
            if newFileNameTemp.index(x) + 1 < len(newFileNameTemp): # this if and next if are for November 29-December 1, 2012. the others ones, after month, the rest will all be converted, but this one, after month, there is another month 
                if newFileNameTemp[newFileNameTemp.index(x) + 1] not in numbersOrSymboles: 
                    newFileName = newFileName + "_"
        else:
            newFileName = newFileName + x

    newFileName = newFileName + ".txt"

    # why am i getting less files i want? because there are duplciate on the dates!!! why don't they combine the same day event together??? no good...  
    if newFileName in newFileNames:
        print("duplicate!")
        newFileName = newFileName[0:-4] + "_duplicate_" + letters[numbersOrSymboles.index(str(duplicatesCount))] + ".txt"
        duplicatesCount = duplicatesCount + 1
  
    newFileNames.append(newFileName)

print("length of newFileNames array: " + str(len(newFileNames)))
# for n in newFileNames:
#     print(n)

# allinfosFilesFolderPath = "C:/Users/litia/OneDrive - Brigham Young University Hawaii/Desktop/byuh events python helper/allInfosFiles/"
# for index in range(0, len(newFileNames)):

#     thisFileContent = infos[index]
#     thisFileName = newFileNames[index]

#     f = open(allinfosFilesFolderPath + thisFileName, "a", encoding='utf-8')
#     f.write(thisFileContent)
#     f.close

#     print(str(index) + " files created" )


# helperFolderPath = "C:/Users/litia/OneDrive - Brigham Young University Hawaii/Desktop/byuh events python helper/"
# f = open(helperFolderPath + "allInfoFilesNames.txt", "a", encoding='utf-8')
# for n in newFileNames: 
#     f.write(n)
#     f.write("\n")
# f.close


helperFolderPath = "C:/Users/litia/OneDrive - Brigham Young University Hawaii/Desktop/byuh events python helper/"
f = open(helperFolderPath + "allEventsDates.txt", "a", encoding='utf-8')
for d in dates: 
    f.write(d)
    f.write("\n")
f.close






