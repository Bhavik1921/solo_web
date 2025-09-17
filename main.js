document.addEventListener("DOMContentLoaded", function () {
  const element = document.querySelector(".autoTakeFull");

  const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.classList.add("animate");
} else {
        entry.target.classList.remove("animate");
      }
    });
  }, {
    threshold: 0.5
  });

  observer.observe(element);
});

