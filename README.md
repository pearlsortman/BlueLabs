# BlueLabs

## Data API Coding Challenge
### General Guidelines
Choose a language that you are familiar with and very productive at--we don’t care if it’s obscure or boring or something we don’t work with. We wouldn’t be talking to you if we didn’t think you can learn a new programming language, but right now we’re trying to help you show us other things.

In particular, we’re trying to learn about your coding skills and which techniques you apply. You’re not being judged on whether you complete this challenge or not, but instead on what you show us in the process of working through it. As such, please write elegant code that shows off the techniques you know, even if that results in you getting less far into solving the problem.

Please plan to spend roughly an hour or so coding on this total.  Again, we’re not evaluating how fast you can complete this, but what things you show us along the way.

### Instructions
#### Data
Here is a ZIP file containing CSVs with the results of the 2016 Iowa Caucuses:

https://drive.google.com/file/d/0B28WMUK0gXqRYjJ1ZDhmSTAzUTA/view?usp=sharing

#### Response
Using that data, we would like you to produce a JSON API with the following endpoints:

#### GET http://your-service-here/counties
Returns all counties with election results in the following format:

`{
  "counties": [
    {
      "name": "Adair",
      "fips": "19001",
      "elections": [
        {
          "party": "Democratic",
          "results": [
            {"candidate": "Hillary Clinton", "votes": 113},
            {"candidate": "Bernie Sanders", "votes": 86},
            {"candidate": "Martin O'Malley","votes": 0}
          ]
        }
        {
          "party": "Republican",
          "results": [
            {"candidate": "Ted Cruz","votes": 104},
            {"candidate": "Donald Trump","votes": 104}
            ...
          ]
        }
      ]
    },
    {
      "name": "Adams",
      "fips": "19003",
      "elections": [
        ...
      ]
    }
  ]
}`


#### GET http://your-service-here/counties?democratic_winner=Hillary%20Clinton&republican_winner=Ted%20Cruz
Returns the above results, but filtered to only show counties where the specified candidate received the most votes (including ties).


#### GET /counties/19001
Returns the results for the county with the specified FIPS code.

`{
  "name": "Adair",
  "fips": "19001",
  "elections": [
    {
      "party": "Democratic",
      "results": [
        {"candidate": "Hillary Clinton", "votes": 113},
        {"candidate": "Bernie Sanders","votes": 86},
        {"candidate": "Martin O'Malley","votes": 0}
      ]
    }
    {
      "party": "Republican",
      "results": [
        {"candidate": "Ted Cruz","votes": 104},
        {"candidate": "Donald Trump","votes": 104}
        ...
      ]
    }
  ]
}`

You are free to use any language or framework to develop this API.
