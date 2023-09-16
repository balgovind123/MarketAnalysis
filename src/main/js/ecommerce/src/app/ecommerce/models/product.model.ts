export class ReportModel {
    serialId: number;
    reportTitle: string;
    reportCategory: string;
    reportCode: string;
    dateTime: string;
    format: string;
    reportDescription: string;
    tableofContents: string;
    singleUserPriceInUS: number;
    multiUserPriceInUS: string;
    enterPriceSiteLicensePriceInUs: string;

    constructor( serialId: number,reportTitle: string,reportCategory: string,reportCode: string,dateTime: string,format: string,reportDescription: string,tableofContents: string,singleUserPriceInUS: number,multiUserPriceInUS: string, enterPriceSiteLicensePriceInUs: string) {
    this.serialId = serialId;
    this.reportTitle = reportTitle;
    this.reportCategory =  reportCategory;
    this.reportCode = reportCode;
    this.dateTime = dateTime;
    this.format: format;
    this.reportDescription: reportDescription;
    this.tableofContents: tableofContents;
    this.singleUserPriceInUS: singleUserPriceInUS;
    this.multiUserPriceInUS: multiUserPriceInUS;
    this.enterPriceSiteLicensePriceInUs: enterPriceSiteLicensePriceInUs;
    }
}
