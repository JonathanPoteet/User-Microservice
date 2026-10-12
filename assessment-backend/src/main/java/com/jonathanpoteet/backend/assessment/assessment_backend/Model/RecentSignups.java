package com.jonathanpoteet.backend.assessment.assessment_backend.Model;

public record RecentSignups(
    Date dateCreated,
    String city,
    String profession
) {}
