<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> -->
  <link rel="stylesheet" href="./css/style.css">
  <title>XWorkz</title>
</head>
<body>

  <div class="mynav">
    <ul class="horizontal">
      <li style="margin-left: 10px;"><a href="./index.jsp" style="padding-bottom: 10px;"><img src="./images/xworkz-logo.png"  width="40px" alt="" style="display: inline-block;"></a></li>
      <li><a href="./index.jsp">Home</a></li>
      <li><a href="bookresort.jsp" id="book">Book</a></li>
      <li><a href="resortbookings">View Details</a></li>
      <li style="height: 48px; margin-left: 25vw;text-align: center;"><a href="./index.jsp" style="padding: 9px ;"><h2  id="title">RESORTS<h2></a></li>
      <li style="float:right; margin-right: 30px;"><a href="feedbackpage.jsp">Provide Feedback</a></li>
    </ul>
  </div>

  <br>

  <div id="images-grid">
    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-1.jpg" alt="Cinque Terre">
      </a>
      <div class="desc">
        <h4 class="img-title">Caravela Beach Resort</h4>
        <p>The Caravela Beach Resort is an independent '5-Star' Deluxe beach resort comprising of 201 rooms, several of which have direct sea-views.</p>
      </div>
    </div>
    
    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-2.jpg" alt="Forest">
      </a>
      <div class="desc">
        <h4 class="img-title">Fairfield by Marriott</h4>
        <p>Find the beauty of simplicity at Fairfield Goa Benaulim in South Goa, India. Our tropically inspired hotel is just minutes from the pure sands of Benaulim Beach. </p>
      </div>
    </div>
    
    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-3.jpg" alt="Northern Lights">
      </a>
      <div class="desc">
        <h4 class="img-title">Fahrenheit Resorts</h4>
        <p>Fahrenheit Hotel is located opposite the famous Baga beach - one can just stroll away from one's suite for a serene experience.</p>
      </div>
    </div>

    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-8.jpg" alt="Mountains">
      </a>
      <div class="desc">
        <h4 class="img-title">Riva Beach Resort</h4>
        <p>You will find Riva Beach Resort situated on the white sandy beach, Mandrem Beach, one of the finest beaches of North Goa. </p>
      </div>
    </div>
    
    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-4.jpg" alt="Mountains">
      </a>
      <div class="desc">
        <h4 class="img-title">Om Sai Beach Huts</h4>
        <p>Om Sai Beach Huts offers sea view accommodation on the beautiful Agonda beach in South Goa. Om Sai Beach huts have 18 seperate units that are right on the beach.</p>
      </div>
    </div>

    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-5.jpg" alt="Mountains">
      </a>
      <div class="desc">
        <h4 class="img-title">Novotel Goa Dona Sylvia Resort</h4>
        <p>Overlooking Cavelossim Beach and set in 20 acres of beautifully secluded landscaped gardens, brings to mind a quaint Portuguese village reminiscent of a bygone era.</p>
      </div>
    </div>

    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-6.jpg" alt="Mountains">
      </a>
      <div class="desc">
        <h4 class="img-title">Seasons Hotel & Spa</h4>
        <p>Looking for a place to stay in Margao? Then look no further than Seasons Hotels & Resorts, a charming small hotel that brings the best of Margao to your doorstep.</p>
      </div>
    </div>

    <div class="gallery">
      <a target="_blank" href="bookresort.jsp">
        <img src="./images/resort-7.jpg" alt="Mountains">
      </a>
      <div class="desc">
        <h4 class="img-title">Taj Exotica Resort</h4>
        <p>Situated on the south coast of Goa on the Benaulim beach, a mere 27 km from the airport, this 56 acre 140 room resort has a 800 meter beach frontage and a lovely view of the sea.</p>
      </div>
    </div>

  </div>

  <div class="footer">
    <ul>
      <li>&copy; Ullas G, Software Developer</li>
      <li><span id="time"></span></li>
      <div class="links">
        <li><a href="https://www.linkedin.com/in/ullas-ganesh"><img src="./images/linkedin-icon.png" alt="" height="20px"></a></li>
        <li><a href="https://github.com/Ullasganesh01"><img src="./images/gitHub-icon.png" alt="" height="20px"></a></li>
        <li><a href="#"><img src="./images/instagram-icon.png" alt="" height="20px"></a></li>
      </div>
    </ul>
  </div>

  <!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script> -->
  <script src="./js/index.js"></script>

</body>
</html>