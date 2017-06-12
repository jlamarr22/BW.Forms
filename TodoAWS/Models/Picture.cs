using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;

namespace TodoAWSSimpleDB.Models
{
    public class Picture
    {
        private object _url;
        [JsonProperty("data")]
        public object Url {
            get
            {
                return _url;
            }
            set { _url = JObject.Parse(value.ToString()).GetValue("url"); }
        }
    }
}
