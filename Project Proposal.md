## Capstone Project Proposal

1.Motivation

Are we happy? This is the question we ask all the time. But what makes us happy? What is reason? Income? Peace? Alcohol? Or even smoking? Is our culture background also affects our emotion? In this project, I would like to do some research on what is the reason or reasons that make us happy. Which is the most important factor. Besides, I would like to investigate the correlation between suicide and happy. We can apply statistical method to answer those questions. In addition to these possible questions, we can also try to answer questions such as: can we build a linear regression model to predict if people are happy or not. Of course, this is not the only way to explore this question. Some other questions that could also be investigated are: Are different countries have different happiness? Are people at different period of time have the same happiness?


2. What is the problem you want to solve

As I mentioned in the first paragraph, for this problem, we can try to answer the questions in four aspects: 
What is the culture and geographic distribution of the happiness? How does this value vary with time?  How the happiness distributed for different continent?
What is the core factor that significantly affect our happiness? What is their relation? Can we make a prediction of the happiness based on it? In order to answer this question, it is impossible to go over all possible factors that might affect the result, so I want to limit our study on these factors: (1). The total income of the country (here, people often use two index to show the total income: GDP per capita or log GDP per capita,Log of Per capita GDP = Log (Total GDP/ Population) ); (2). The food consumption. Here we only restrict ourself on wheat and vegetables. (3). The working hours for different country; 
Can we categorize the happiness for different countries?
We can analyze the correlation between happiness and some other social problems: alcohol/tobacco consumption, suicide rate, etc. Here, we can compare the alcohol consumption data with the happiness index.
We can divide the happiness score as ‘Happy’,’It is ok’, and ‘Sad’. Since we have many features, can we find a model that classify the countries into these three categories? So this is a multivariable classification problem.

The skill set I might use:
Linear regression
Classification
Time series 
Data visualization

3. Who is your client and why do they care about this problem? In other words, what will your client DO or DECIDE based on your analysis that they wouldn’t have otherwise?

The potential client of my study will be journalists, economists, and policy makers. For journalists, they can publish a social study report on the newspaper and tell the reader what is our current social problem. For the policy makers or politicians, they will realize which aspects of our social could be improved in the future. For economist, my study will provide them some information about the relation between happiness and economic development.


4. What data are you going to use for this? How will you acquire this data?

Related data set:
There are some available data set online that might be useful for our investigation. 
1. http://worldhappiness.report/
2. https://en.wikipedia.org/wiki/Gross_National_Happiness (This is not the dataset, it is the definition of happiness)
3. http://www.fao.org/faostat/en/#data/CC
4. http://apps.who.int/gho/data/node.main.MHSUICIDE?lang=en
5. http://apps.who.int/gho/data/node.main.A1026?lang=en
6. https://www.conference-board.org/data/economydatabase/index.cfm?id=30565
7. http://data.worldbank.org/indicator/NY.GDP.PCAP.CD?view=map&year=2015



5. In brief, outline your approach to solving this problem (knowing that this might change later).

This problem is related to  a ‘big’ topic. So that there are many different ways to study this project. But for my interest of study, I would like to perform a regression study, my focus is on the relation between happiness and total income, country, time, and other social problems. What I want to figure out is what is the important factor that determine our happiness. Can we make any predictions based on the model? Or can we classify the countries in the world based on their happiness index (of course, we need to find out the mathematical definition of the this index. This is not too difficult to do, since there have been many researches on this topic)? The difficulties I might meet are: the data that are gonna be used to answer this question are distributed in different data set. So in order to have all the date we need, I have to spend lots of time on data cleaning. Also, the data might be noisy, that will make the analysis data difficult. For the purpose of study, some statistical analysis is also necessary.


6. What are your deliverables? Typically, this would include code, along with a paper and/or a slide deck.
Code for the project, well-documented on github. The data set I used to answer to the questions
A final paper explaining the problem, the approach and the findings in complete technical detail. Include ideas for further research, as well as some concrete recommendations for your client on how to use your findings.
The slides and powerpoint file I am going to use to present my research result. 
All the basic and important data visualization pictures that illustrate the model and inferential statistics.
