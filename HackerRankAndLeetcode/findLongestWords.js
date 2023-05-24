function findLongestWords(str) {
    let longestWords = [];
    let currentWord = '';
  
    for (let i = 0; i < str.length; i++) {
      let char = str[i];
  
      // Check if current character is a letter
      if (/[a-zA-Z]/.test(char)) {
        currentWord += char;
      } else {
        // Check if current word is longer than current longest word(s)
        if (currentWord.length > longestWords[0]?.length || !longestWords.length) {
          longestWords = [currentWord];
        } else if (currentWord.length === longestWords[0]?.length) {
          longestWords.push(currentWord);
        }
        currentWord = '';
      }
    }
  
    // Check if last word in string is longer than current longest word(s)
    if (currentWord.length > longestWords[0]?.length || !longestWords.length) {
      longestWords = [currentWord];
    } else if (currentWord.length === longestWords[0]?.length) {
      longestWords.push(currentWord);
    }
  
    return longestWords;
  }
  