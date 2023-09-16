package com.research.MarketAnalysis.entity;


import lombok.*;

import javax.persistence.*;
@Entity
@Table(name="Report_Track")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReportModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "Report Title")
    private Long serialId;
    @Column(name = "ReportTitle")
    private String reportTitle;
    @Column(name = "ReportCategory")
    private String reportCategory;
    @Column(name = "ReportCode")
    private String reportCode;
    @Column(name = "DatePublished")
    private String dateTime;
    @Column(name = "Format")
    private String format;
    @Column(name = "AuthorName")
    private String authorName;
    @Column(name = "ReportDescription")
    private String reportDescription;
    @Column(name = "TableOfContent")
    private String tableofContents;
    @Column(name = "SingleUserPriceinUS$")
    private String singleUserPriceInUS;
    @Column(name = "MultiUserPriceinUS$")
    private String multiUserPriceInUS;
    @Column(name = "EnterpriseSitelicencePriceinUS$")
    private String enterPriceSiteLicensePriceInUs;

}
