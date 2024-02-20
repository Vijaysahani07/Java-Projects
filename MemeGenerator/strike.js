let currentMemeUrl = "";

const fetchMeme = () => {
  fetch("https://meme-api.herokuapp.com/gimme")
    .then((data) => data.json())
    .then((data_val) => {
      currentMemeUrl = data_val.url;
      document.getElementById("myImg").src = currentMemeUrl;
    })

    .catch((err) => {
      console.error("Failed to fetch meme:", err);
      document.getElementById("myImg").src = "fallback-meme.jpg";
    });
};

function share() {
  if (navigator.share) {
    navigator
      .share({
        title: "Random Meme",
        text: "Check out this meme!",
        url: currentMemeUrl,
      })
      .then(() => console.log("Shared successfully"))
      .catch((err) => console.error("Error sharing:", err));
  } else {
    alert("Sharing not supported in this browser.");
    // Fallback: Open Twitter intent
    window.open(
      `https://twitter.com/intent/tweet?text=Check%20this%20meme!&url=${currentMemeUrl}`
    );
  }
}
// Initial fetch + auto-refresh every 5 sec
fetchMeme();
setInterval(fetchMeme, 5000);
