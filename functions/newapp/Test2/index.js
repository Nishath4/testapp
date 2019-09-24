module.exports = (context, basicIO) => {
    /* 
        BASICIO FUNCTIONALITIES
    */
    basicIO.write("response check..."); //response stream (accepts only string, throws error if other than string)
    basicIO.getInputStream(); //Body stream (node readStream)
    basicIO.getArgument("argument1");// returns QUERY_PARAM[argument1] || BODY_JSON[argument1] (takes argument from query and body, first preference to query)
    basicIO.getParameter("argument1");// copy of getArgument but this is depricated

    /* 
        CONTEXT FUNCTIONALITIES
    */
    context.log("my log goes here..."); //writes logs to catalyst
    context.close(); //end of application
}