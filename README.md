# Getting Dressed
* You have to get dressed in the morning before going to work
* 1 = hat 
* 2 = pants 
* 3 = shirt 
* 4 = shoes 
* 5 = socks 
# Pattern:
*  Command Pattern
*  Singleton Pattern
# Test Cases with Results:
*  5 2 3 4 6 -> SOCKS PANTS SHIRT SHOES LEAVE  | Dressed Up and Leave == >>
*  2 5 3 4 1 6 -> PANTS SOCKS SHIRT SHOES HATS LEAVE  | Dressed Up and Leave == >>
*  3 1 2 5 4 6 -> SHIRT HATS PANTS SOCKS SHOES LEAVE  | Dressed Up and Leave == >>
*  4 3 2 1 6 -> SHOES  | fail 
*  2 5 3 4 1 -> PANTS SOCKS SHIRT SHOES HATS  | Dressed Up 
*  2 3 4 5 1 -> PANTS SHIRT SHOES  | fail 
*  5 1 3  -> SOCKS HATS  | fail 
