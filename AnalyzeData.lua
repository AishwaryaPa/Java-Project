--[[
Name:             AnalyzeData.lua
Author:           Aishwarya Panchumarty
Date:             12/13/17
Description:      This file 
--]]

local data = {}
local length = 0
local totalGames

local player1Matches = {}
local player1Matches = 0

local player2Matches = {}
local player2Matches = 0

local totalGuesses = 0

local guesses = {}

local player1Streak = {}
local streak1
local player2Streak = {}
local streak2

function openFile()
    for line in io.lines("data.txt") do
       table.insert(data, line);
    end
    io.flush()
end
openFile()

function findLength()
   for i in pairs(data) do
       length = length + 1
   end 
end
findLength() 

--[[--------------------------------------------------------------------------------]]

--[[ Total Number of Games--]]
function findNumGames()
   totalGames = length / 6
   print("Total Games: ", totalGames)
end
findNumGames()

--[[--------------------------------------------------------------------------------]]

--[[ Average Number of Matches found by Player1 --]]
function Player1average()
   local average = 0
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       player1Matches = player1Matches + data[(2 + (6 * i))]
   end
   average = player1Matches/totalGames

   print("Average Number of Matches found by Player1: ", average)
   print("Approximately: ", math.floor(average))
end
Player1average()

--[[--------------------------------------------------------------------------------]]

--[[ Average Number of Matches found by Player2 --]]
function Player2average()
   local average = 0
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       player2Matches = player2Matches + data[(3 + (6 * i))]
   end
   average = player2Matches/totalGames

   print("Average Number of Matches found by Player2: ", average)
   print("Approximately: ", math.floor(average))
end
Player2average()

--[[--------------------------------------------------------------------------------]]

--[[ Average number of guesses per game--]]
function guessesAverage()
   local average = 0
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       totalGuesses = totalGuesses + data[(4 + (6 * i))]
   end
   average = totalGuesses/totalGames

   print("Average number of guesses per game: ", average)
   print("Approximately: ", math.floor(average))
end
guessesAverage()

--[[--------------------------------------------------------------------------------]]

--[[ Player that won the most--]]
function getWinner()
   if (player1Matches > player2Matches) then
   print("Player1 has the most matches")	
  
   else
   print("Player2 has the most matches") 	 
  
   end
end
getWinner()

--[[--------------------------------------------------------------------------------]]

--[[ Game that took the most guesses --]]
function MostGuesses()
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       table.insert(guesses, data[(4 + (6 * i))])
   end

   local max = guesses[1]
   for i = 2, totalGames do
       if guesses[i] > max then
           max = guesses[i]
       end
   end

   print("Most guesses is: ", max)
end
MostGuesses()

--[[--------------------------------------------------------------------------------]]

--[[ Game that took the most guesses --]]
function LeastGuesses()
   local min = guesses[1]
   for i = 2, totalGames do
       if guesses[i] < min then
           min = guesses[i]
       end
   end

   print("Least guesses is: ", min)
end
LeastGuesses()

--[[--------------------------------------------------------------------------------]]

--[[ Longest streak any player went on, that is consecutive correct guesses in a single turn --]]
function player1LongestStreak()
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       table.insert(player1Streak, data[(5 + (6 * i))])
   end

   streak1 = player1Streak[1]
   for i = 2, totalGames do
       if player1Streak[i] > streak1 then
           streak1 = player1Streak[i]
       end
   end
end
player1LongestStreak()

function player2LongestStreak()
   local lastIndex = length/6
   for i = 1, lastIndex do
       i = i - 1;
       table.insert(player2Streak, data[(6 + (6 * i))])
   end

   streak2 = player1Streak[1]
   for i = 2, totalGames do
       if player2Streak[i] > streak2 then
           streak2 = player2Streak[i]
       end
   end
end
player2LongestStreak()

function longestStreak()
   if (streak1 > streak2) then
       print("Player1 has the longest streak. This player matched", streak1, "cards in a row" )

   else if (streak1 > streak2) then
       print("Player2 has the longest streak. This player matched", streak2, "cards in a row" )

   else
       print("Player1 and Player2 have the longest streak. They were able to match", streak1, "cards in a row" )
   end
   end
end
longestStreak()

--[[--------------------------------------------------------------------------------]]

