hist(pop)// Histogram of population
hist(pop, breaks=20)// Histogram of population with 20 breaks
hist(pop, breaks=20, col="blue", main="Population Histogram", xlab="Population", ylab="Frequency")// Histogram of population with 20 breaks, blue color, title and axis labels
hist(pop, breaks=20, col="blue", main="Population Histogram", xlab="Population", ylab="Frequency", border="black")// Histogram of population with 20 breaks, blue color, title and axis labels, black border

plot(pop, type="h", main="Population Histogram", xlab="Population", ylab="Frequency")// Histogram of population with vertical lines
plot(pop, type="h", main="Population Histogram", xlab="Population", ylab="Frequency", col="blue")// Histogram of population with vertical lines, blue color

cor(pop, pop)// Correlation of population with itself
cor(pop, pop, method="pearson")// Pearson correlation of population with itself

par(mfrow=c(2,2))// Set up a 2x2 plotting area
hist(pop, breaks=20, col="blue", main="Population Histogram", xlab="Population", ylab="Frequency")// Histogram of population with 20 breaks, blue color, title and axis labels

>pdf("A")// Create a PDF file and name it "A"
>dev.off()// Close the PDF device
>